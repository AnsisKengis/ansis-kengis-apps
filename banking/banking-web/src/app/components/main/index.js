import uiRouter from "angular-ui-router/release/angular-ui-router";

export default angular
	.module('app.components.main', [uiRouter])
	.component('main', require("./main.component"))
	.config(($stateProvider) => {
		'ngInject';
		$stateProvider
			.state('app.main', {
				url: '/',
				component: 'main'
			})
	})
;