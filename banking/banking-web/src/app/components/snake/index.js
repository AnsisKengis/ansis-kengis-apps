import uiRouter from "angular-ui-router/release/angular-ui-router";
import snake from "./snake.component";

export default angular
	.module('app.components.snake', [uiRouter])
	.component('snake', require("./snake.component"))
	.config(($stateProvider) => {
		'ngInject';
		$stateProvider
			.state('app.snake', {
				url: '/snake',
				component: 'snake'
			})
	});