(ns counting-component.core
  (:require [reagent.core :as reagent :refer [atom]]))

(def click-count (atom 0))

(defn counting-component []
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click Me!" :on-click #(swap! click-count inc)}]])

(reagent/render-component [counting-component]
                          (. js/document (getElementById "app")))