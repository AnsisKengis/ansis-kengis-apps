import "./registration.style.scss";
import template from "./registration.component.html";

class RegistrationController {
    constructor($http) {
        this.$http = $http;

    }

}

export default {
    template: template,
    controller: RegistrationController
};
