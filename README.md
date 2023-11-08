
# Clojurescript App using an importmap

This app demonstrates using 3rd party npm libraries (e.g. React) which are downloaded directly from the browser, as opposed to being downloaded and bundled at build time.

The actual app is just the [tanstack react-router 'quick-start'](https://tanstack.com/router/v1/docs/quick-start) in cljs.

# Usage

As per usual [tiado-cljs2](https://github.com/henryw374/tiado-cljs2) ...

* `clj`
* in started REPL: `(require 'cljs)`
* `(cljs/app-watch)`
* visit http://localhost:9000/ to see the app

# Todo 

tests where deps are coming via importmap 
dev or prod versions of libs (e.g. for React performance profiling)