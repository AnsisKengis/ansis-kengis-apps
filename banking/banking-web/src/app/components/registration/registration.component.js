import "./registration.style.scss";
import template from "./registration.component.html";

class RegistrationController {
    constructor(clientService, $state) {
        this.clientService = clientService;
        this.$state = $state;
    }

    $onInit() {
        this.model = {
            email: '',
            password: ''
        }
    }

    refresh() {
    }

    signUp() {
        this.clientService.signup(this.model).then(() => {
            this.$state.go("app.profile");
        })
    }
}

export default {
    template: template,
    controller: RegistrationController
};
