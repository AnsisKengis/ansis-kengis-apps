import main from "./main/";
import login from "./login/";
import registration from "./registration/";
import snake from "./snake/";

export default angular
    .module('app.components', [
        main.name,
        login.name,
        registration.name,
        snake.name
    ])
