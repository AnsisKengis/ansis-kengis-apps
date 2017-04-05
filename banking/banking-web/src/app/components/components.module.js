import main from "./main/";
import login from "./login/";
import registration from "./registration/";
import profile from "./profile/";

export default angular
    .module('app.components', [
        main.name,
        login.name,
        registration.name,
        profile.name
    ])
