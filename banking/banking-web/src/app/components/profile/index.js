import uiRouter from "angular-ui-router/release/angular-ui-router";
import profile from "./profile.component";

export default angular
    .module('app.components.profile', [uiRouter])
    .component('profile', profile)
    .config(($stateProvider) => {
        'ngInject';
        $stateProvider
            .state('app.profile', {
                url: '/profile',
                component: 'profile',
            });
    })
;