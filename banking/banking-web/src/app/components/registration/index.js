import uiRouter from "angular-ui-router/release/angular-ui-router";
import registration from "./registration.component";

export default angular
    .module('app.components.registration', [uiRouter])
    .component('registration', registration)
    .config(($stateProvider) => {
        'ngInject';
        $stateProvider
            .state('app.registration', {
                url: '/registration',
                component: 'registration',
            });
    })
;