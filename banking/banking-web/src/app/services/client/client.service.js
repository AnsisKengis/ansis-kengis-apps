class ClientService {

    /*@ngInject*/
    constructor($http) {
        this.$http = $http;
    }

    signup(credentials) {
        return this.$http.post('/api/public/web/signup', credentials);
    }
}

export default ClientService;
