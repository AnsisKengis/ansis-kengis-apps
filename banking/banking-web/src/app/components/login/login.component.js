import "./login.style.scss";
import template from "./login.component.html";

class LoginController {
    constructor() {
        this.model = {
            email: '',
            password: ''
        }
    }
    login() {
        this.clientService.login(this.model);
    }
}
export default {
    template: template,
    controller: LoginController
};
