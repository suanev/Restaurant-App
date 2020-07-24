function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["Cart-cart-module"], {
  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/Cart/cart.page.html":
  /*!*********************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/Cart/cart.page.html ***!
    \*********************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppPagesCartCartPageHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<ion-header [translucent]=\"true\">\n  <ion-toolbar>\n    <ion-title>\n      Tab 3\n    </ion-title>\n  </ion-toolbar>\n</ion-header>\n\n<ion-content [fullscreen]=\"true\">\n  <ion-header collapse=\"condense\">\n    <ion-toolbar>\n      <ion-title size=\"large\">Tab 3</ion-title>\n    </ion-toolbar>\n  </ion-header>\n\n  <app-explore-container name=\"Tab 3 page\"></app-explore-container>\n</ion-content>\n";
    /***/
  },

  /***/
  "./src/app/pages/Cart/cart-routing.module.ts":
  /*!***************************************************!*\
    !*** ./src/app/pages/Cart/cart-routing.module.ts ***!
    \***************************************************/

  /*! exports provided: CartRoutingModule */

  /***/
  function srcAppPagesCartCartRoutingModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CartRoutingModule", function () {
      return CartRoutingModule;
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


    var _cart_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./cart.page */
    "./src/app/pages/Cart/cart.page.ts");

    var routes = [{
      path: '',
      component: _cart_page__WEBPACK_IMPORTED_MODULE_3__["Cart"]
    }];

    var CartRoutingModule = function CartRoutingModule() {
      _classCallCheck(this, CartRoutingModule);
    };

    CartRoutingModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
      exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
    })], CartRoutingModule);
    /***/
  },

  /***/
  "./src/app/pages/Cart/cart.module.ts":
  /*!*******************************************!*\
    !*** ./src/app/pages/Cart/cart.module.ts ***!
    \*******************************************/

  /*! exports provided: CartModule */

  /***/
  function srcAppPagesCartCartModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CartModule", function () {
      return CartModule;
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


    var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/__ivy_ngcc__/fesm2015/router.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");
    /* harmony import */


    var _angular_common__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @angular/common */
    "./node_modules/@angular/common/__ivy_ngcc__/fesm2015/common.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/__ivy_ngcc__/fesm2015/forms.js");
    /* harmony import */


    var _cart_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./cart.page */
    "./src/app/pages/Cart/cart.page.ts");
    /* harmony import */


    var _cart_routing_module__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(
    /*! ./cart-routing.module */
    "./src/app/pages/Cart/cart-routing.module.ts");

    var CartModule = function CartModule() {
      _classCallCheck(this, CartModule);
    };

    CartModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["NgModule"])({
      imports: [_ionic_angular__WEBPACK_IMPORTED_MODULE_1__["IonicModule"], _angular_common__WEBPACK_IMPORTED_MODULE_4__["CommonModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_5__["FormsModule"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild([{
        path: '',
        component: _cart_page__WEBPACK_IMPORTED_MODULE_6__["Cart"]
      }]), _cart_routing_module__WEBPACK_IMPORTED_MODULE_7__["CartRoutingModule"]],
      declarations: [_cart_page__WEBPACK_IMPORTED_MODULE_6__["Cart"]]
    })], CartModule);
    /***/
  },

  /***/
  "./src/app/pages/Cart/cart.page.scss":
  /*!*******************************************!*\
    !*** ./src/app/pages/Cart/cart.page.scss ***!
    \*******************************************/

  /*! exports provided: default */

  /***/
  function srcAppPagesCartCartPageScss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL0NhcnQvY2FydC5wYWdlLnNjc3MifQ== */";
    /***/
  },

  /***/
  "./src/app/pages/Cart/cart.page.ts":
  /*!*****************************************!*\
    !*** ./src/app/pages/Cart/cart.page.ts ***!
    \*****************************************/

  /*! exports provided: Cart */

  /***/
  function srcAppPagesCartCartPageTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "Cart", function () {
      return Cart;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/__ivy_ngcc__/fesm2015/core.js");

    var Cart = function Cart() {
      _classCallCheck(this, Cart);
    };

    Cart = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: 'app-cart',
      template: Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"])(__webpack_require__(
      /*! raw-loader!./cart.page.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/Cart/cart.page.html"))["default"],
      styles: [Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"])(__webpack_require__(
      /*! ./cart.page.scss */
      "./src/app/pages/Cart/cart.page.scss"))["default"]]
    })], Cart);
    /***/
  }
}]);
//# sourceMappingURL=Cart-cart-module-es5.js.map