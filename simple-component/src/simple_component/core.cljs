(ns simple-component.core
  (:require [reagent.core :as reagent :refer [atom]]))

(defn simple-component []
      [:div
       [:p "I am a component"]
       [:p.somclass
        "I have " [:strong "bold"]
        [:span {:style {:color "red"}} " and red "] "text."]])

(reagent/render-component [simple-component]
                          (. js/document (getElementById "app")))