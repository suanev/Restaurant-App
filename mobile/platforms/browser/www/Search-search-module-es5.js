function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["Search-search-module"], {
  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/Search/search.page.html":
  /*!*************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/Search/search.page.html ***!
    \*************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppPagesSearchSearchPageHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<ion-header [translucent]=\"true\">\n  <ion-toolbar>\n    <ion-title>\n      Tab 2\n    </ion-title>\n  </ion-toolbar>\n</ion-header>\n\n<ion-content [fullscreen]=\"true\">\n  <ion-header collapse=\"condense\">\n    <ion-toolbar>\n      <ion-title size=\"large\">Tab 2</ion-title>\n    </ion-toolbar>\n  </ion-header>\n\n</ion-content>\n";
    /***/
  },

  /***/
  "./src/app/pages/Search/search-routing.module.ts":
  /*!*******************************************************!*\
    !*** ./src/app/pages/Search/search-routing.module.ts ***!
    \*******************************************************/

  /*! exports provided: SearchRoutingModule */

  /***/
  function srcAppPagesSearchSearchRoutingModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "SearchRoutingModule", function () {
      return SearchRoutingModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/__ivy_ngcc__/fesm2015/router.js");
    /* harmony import */


    var _search_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./search.page */
    "./src/app/pages/Search/search.page.ts");

    var routes = [{
      path: '',
      component: _search_page__WEBPACK_IMPORTED_MODULE_3__["Search"]
    }];

    var SearchRoutingModule = function SearchRoutingModule() {
      _classCallCheck(this, SearchRoutingModule);
    };

    SearchRoutingModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
      exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
    })], SearchRoutingModule);
    /***/
  },

  /***/
  "./src/app/pages/Search/search.module.ts":
  /*!***********************************************!*\
    !*** ./src/app/pages/Search/search.module.ts ***!
    \***********************************************/

  /*! exports provided: SearchModule */

  /***/
  function srcAppPagesSearchSearchModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "SearchModule", function () {
      return SearchModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _ionic_angular__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @ionic/angular */
    "./node_modules/@ionic/angular/__ivy_ngcc__/fesm2015/ionic-angular.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
    /* harmony import */


    var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/common */
    "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/__ivy_ngcc__/fesm2015/forms.js");
    /* harmony import */


    var _search_page__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! ./search.page */
    "./src/app/pages/Search/search.page.ts");
    /* harmony import */


    var _search_routing_module__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./search-routing.module */
    "./src/app/pages/Search/search-routing.module.ts");

    var SearchModule = function SearchModule() {
      _classCallCheck(this, SearchModule);
    };

    SearchModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["NgModule"])({
      imports: [_ionic_angular__WEBPACK_IMPORTED_MODULE_1__["IonicModule"], _angular_common__WEBPACK_IMPORTED_MODULE_3__["CommonModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_4__["FormsModule"], _search_routing_module__WEBPACK_IMPORTED_MODULE_6__["SearchRoutingModule"]],
      declarations: [_search_page__WEBPACK_IMPORTED_MODULE_5__["Search"]]
    })], SearchModule);
    /***/
  },

  /***/
  "./src/app/pages/Search/search.page.scss":
  /*!***********************************************!*\
    !*** ./src/app/pages/Search/search.page.scss ***!
    \***********************************************/

  /*! exports provided: default */

  /***/
  function srcAppPagesSearchSearchPageScss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL1NlYXJjaC9zZWFyY2gucGFnZS5zY3NzIn0= */";
    /***/
  },

  /***/
  "./src/app/pages/Search/search.page.ts":
  /*!*********************************************!*\
    !*** ./src/app/pages/Search/search.page.ts ***!
    \*********************************************/

  /*! exports provided: Search */

  /***/
  function srcAppPagesSearchSearchPageTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Search", function () {
      return Search;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");

    var Search = function Search() {
      _classCallCheck(this, Search);
    };

    Search = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: 'app-search',
      template: Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"])(__webpack_require__(
      /*! raw-loader!./search.page.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/Search/search.page.html"))["default"],
      styles: [Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"])(__webpack_require__(
      /*! ./search.page.scss */
      "./src/app/pages/Search/search.page.scss"))["default"]]
    })], Search);
    /***/
  }
}]);
//# sourceMappingURL=Search-search-module-es5.js.map