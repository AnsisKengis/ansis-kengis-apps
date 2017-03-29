import uiRouter from "angular-ui-router/release/angular-ui-router";
import login from "./login.component";

export default angular
    .module('app.components.login', [uiRouter])
    .component('login', login)
    .config(($stateProvider) => {
        'ngInject';
        $stateProvider
            .state('app.login', {
                url: '/login',
                component: 'login',
            })
    })
;