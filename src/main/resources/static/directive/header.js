function headerDirective() {
    return {
        bindToController: true,
        controller: HeaderController,
        controllerAs: 'vm',
        restrict: 'EA',
        scope: {
            controller: '='
        },
        templateUrl: 'views/header.html'
    };

    function HeaderController($scope) {
        console.log('Header is loaded');
    }
}