(ns say-hello.core
  (:require [reagent.core :as reagent]))

(defn hello-component [name]
  [:p "Hello, " name "!"])

(defn say-hello []
  [hello-component "world"])

(reagent/render-component [say-hello]
                          (. js/document (getElementById "app")))