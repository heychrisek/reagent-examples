(ns simple-parent.core
  (:require [reagent.core :as reagent]))

(defn simple-component []
      [:div
       [:p "I am a component"]
       [:p.somclass
        "I have " [:strong "bold"]
        [:span {:style {:color "red"}} " and red "] "text."]])

(defn simple-parent []
      [:div
       [:p "I include simple-component."]
       [simple-component]])

(reagent/render-component [simple-parent]
                          (. js/document (getElementById "app")))