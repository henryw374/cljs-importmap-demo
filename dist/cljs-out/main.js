import * as esm_import$react from "react";
import * as esm_import$$tanstack$react_router from "@tanstack/react-router";
import * as esm_import$react_dom$client from "react-dom/client";
export const $APP = {};
export const shadow$provide = {};
export const $jscomp = {};
/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
var a,b=new esm_import$$tanstack$react_router.RootRoute({component:function(){return esm_import$react.createElement("div",{},esm_import$react.createElement(esm_import$$tanstack$react_router.Link,{to:"/"},"Home"),esm_import$react.createElement("div",{}),esm_import$react.createElement(esm_import$$tanstack$react_router.Link,{to:"/about"},"About"),esm_import$react.createElement(esm_import$$tanstack$react_router.Outlet,{}))}}),c=new esm_import$$tanstack$react_router.Route({getParentRoute:function(){return b},
path:"/",component:function(){return esm_import$react.createElement("div",{},"This in the Index page")}}),d=new esm_import$$tanstack$react_router.Route({getParentRoute:function(){return b},path:"/about",component:function(){return esm_import$react.createElement("div",{},"This in the About page")}}),e=b.addChildren([c,d]),f=new esm_import$$tanstack$react_router.Router({routeTree:e});export default function(){console.log("Initializing");a=esm_import$react_dom$client.createRoot(document.getElementById("app"));return a.render(esm_import$react.createElement(esm_import$react.StrictMode,{},esm_import$react.createElement(esm_import$$tanstack$react_router.RouterProvider,{router:f},"About")))};
//# sourceMappingURL=main.js.map
