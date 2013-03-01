(ns lkit.routes.home
  (:use compojure.core hiccup.element)
  (:require [lkit.views.layout :as layout]
            [lkit.util :as util]))

(defn home-page []
  (layout/common
    (util/md->html "/md/docs.md")))

(defn about-page []
  (layout/common
   "this is the story of lkit... work in progress"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
