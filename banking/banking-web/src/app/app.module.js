import uiRouter from "angular-ui-router/release/angular-ui-router";
import app from "./app.component.js";
import components from "./components/components.module";
import services from "./services/services.module";
import uiMask from "angular-ui-mask";




angular
    .module('app', [
        uiRouter,
        uiMask,
        components.name,
        services.name,
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



