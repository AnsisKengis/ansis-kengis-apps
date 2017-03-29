import uiRouter from "angular-ui-router/release/angular-ui-router";
import app from "./app.component.js";
import components from "./components/components.module";



angular
    .module('app', [
        uiRouter,
        components.name
    ])
    .component('app', app)
    .config(($stateProvider, $urlRouterProvider, $locationProvider) => {
        'ngInject';
        $stateProvider
            .state('app', {
                url: '/{lang:(?:id|en)}',
                abstract: true,
                component: 'app',
                params: {
                    lang: {squash: true, value: 'id'}
                }
            });

        $urlRouterProvider.otherwise('/');
        $locationProvider.html5Mode(true);
    });

angular.element(document).ready(function () {
    angular.bootstrap(document, ['app']);
});



