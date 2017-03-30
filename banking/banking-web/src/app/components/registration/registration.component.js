import "./registration.style.scss";
import template from "./registration.component.html";

class RegistrationController {
    constructor(clientService) {
        this.clientService = clientService;
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
            this.refresh();
        })
    }
}

export default {
    template: template,
    controller: RegistrationController
};
