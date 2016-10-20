(ns lister.core
  (:require [reagent.core :as reagent]))

(defn lister [items]
  [:ul
   (for [item items]
   ^{:key item} [:li "Item " item])])

(defn lister-user []
  [:div
   "Here's a list"
   [lister (range 3)]])

(reagent/render-component [lister-user]
                          (. js/document (getElementById "app")))
