import publicNavbar from "./public-navbar/public-navbar.component";
import publicFooter from "./public-footer/public-footer.component";
require('ng-device-detector');


export default angular
    .module('app.common', [ 'ng.deviceDetector'])
    .component('publicNavbar', publicNavbar)
    .component('publicFooter', publicFooter);
