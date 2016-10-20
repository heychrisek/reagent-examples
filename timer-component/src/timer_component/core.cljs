(ns timer-component.core
  (:require [reagent.core :as reagent :refer [atom]]))

(defn timer-component []
  (let [seconds-elapsed (atom 0)]
  (fn []
      (js/setTimeout #(swap! seconds-elapsed inc) 1000)
      [:div "Seconds elapsed: " @seconds-elapsed])))

(reagent/render-component [timer-component]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
