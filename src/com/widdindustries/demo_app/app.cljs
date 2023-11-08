(ns com.widdindustries.demo-app.app
  "taken from https://tanstack.com/router/v1/docs/quick-start"
  (:require ["react" :as React :refer (StrictMode)]
            ["react-dom/client" :as ReactDOM]
            ["@tanstack/react-router" :refer (Outlet, RouterProvider, Link, Router, Route, RootRoute)]))

(defn Root []
  (.createElement React "div" #js{}
    (.createElement React Link #js{:to "/"} "Home")
    (.createElement React "div" #js{})
    (.createElement React Link #js{:to "/about"} "About")
    (.createElement React Outlet  #js{})))

(def rootRoute (RootRoute. #js{:component Root}))

(defn Index []
  (.createElement React "div" #js{} "This in the Index page"))

(def indexRoute (Route. #js{:getParentRoute (fn [] rootRoute)
                            :path "/"
                            :component Index}))

(defn About []
  (.createElement React "div" #js{} "This in the About page"))

(def aboutRoute (Route. #js{:getParentRoute (fn [] rootRoute)
                            :path "/about"
                            :component About}))

;// Create the route tree using your routes
(def routeTree (.addChildren rootRoute #js[indexRoute aboutRoute]))


;// Create the router using your route tree
(def router (Router. #js{:routeTree routeTree}))

(defn mount-components []
  (def root (.createRoot ReactDOM (js/document.getElementById "app")))

  (.render root
    (.createElement React StrictMode, #js{},
      (.createElement React RouterProvider #js{:router router}, "About"))))

(defn init []
  (js/console.log "Initializing")
  (mount-components))

(defn ^:dev/after-load on-reload []
  (.clear js/console)
  )


