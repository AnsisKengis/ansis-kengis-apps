'use strict';

var path = require('path');
var webpack = require('webpack');
var autoprefixer = require('autoprefixer');
var HtmlWebpackPlugin = require('html-webpack-plugin');
var Clean = require('clean-webpack-plugin');
var CopyWebpackPlugin = require('copy-webpack-plugin');

module.exports = function makeWebpackConfig(options) {

    var BUILD = !!options.BUILD;

    var config = {};


    config.entry = './src/app/app.module.js';

    // enable loading modules relatively (without the ../../ prefix)
    config.resolve = {
        root: path.join(__dirname, '/src'),
        alias: {
            styles: path.join(__dirname, '/src/app/styles')
        }
    };

    config.output = {
        path: __dirname + '/dist',
        publicPath: BUILD ? '/' : 'http://localhost:8081/',
        filename: BUILD ? '[name].[hash].js' : '[name].bundle.js',
        chunkFilename: BUILD ? '[name].[hash].js' : '[name].bundle.js'
    };

    config.module = {
        loaders: [
            {test: /\.js$/, exclude: /node_modules/, loader: 'ng-annotate!babel?optional[]=runtime'},
            {test: /\.s?css$/, loader: BUILD ? 'style!css!sass' : 'style!css?sourceMap!sass?sourceMap'},
            {test: /\.html$/, exclude: /node_modules/, loader: "raw"},

            // font-awesome
            {
                test: /\.woff(2)?(\?v=[0-9]\.[0-9]\.[0-9])?$/,
                loader: "url-loader?limit=10000&mimetype=application/font-woff"
            },
            {test: /\.(ttf|eot|svg)(\?v=[0-9]\.[0-9]\.[0-9])?$/, loader: "file-loader"},


            // load fonts(inline base64 URLs for <=8k)
            {test: /\.(ttf|eot|svg|otf)$/, loader: "file"},
            {test: /\.woff(2)?$/, loader: "url?limit=8192&minetype=application/font-woff"},

            // load images (inline base64 URLs for <=8k images)
            {test: /\.(png|jpg)$/, loader: 'url-loader?limit=8192'}
        ]
    };

    config.postcss = [
        autoprefixer({
            browsers: ['last 4 version']
        })
    ];

    config.stats = {
        colors: true,
        modules: true,
        reasons: true,
        errorDetails: true
    };

    config.devServer = {
        contentBase: "./src",
        port: 8081,
        noInfo: true,
        hot: true,
        historyApiFallback: true,
        proxy: {
            '/api/*': {
                target: 'http://localhost:8080'
            }
        }
    };

    config.devtool = BUILD ? 'source-map' : 'eval';

    config.plugins = [
        // required for bootstrap :(
        new webpack.ProvidePlugin({
            $: "jquery",
            jQuery: "jquery"
        }),
        new CopyWebpackPlugin([
            { from: 'src/assets' }
        ]),
        new HtmlWebpackPlugin({
            template: './src/index.html',
            inject: 'body',
            minify: BUILD ?
            {
                "minifyJS": false,
                "minifyCSS": false
            } : false
        }),
        new webpack.IgnorePlugin(/^\.\/locale$/, /moment$/)
    ];

    if (BUILD) {
        config.plugins.push(
            new Clean(['dist']),
            new webpack.NoErrorsPlugin(),
            new webpack.optimize.DedupePlugin(),
            new webpack.optimize.UglifyJsPlugin()
        )
    }

    config.externals = {
        jquery: 'jQuery',
        angular: 'angular'
    };

    return config;
};
