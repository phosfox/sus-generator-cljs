(ns app.sus
  (:require
   [app.susses :refer [susses]]
   [reagent.core :as r]))

(def sus-text (r/atom "SUS"))

(defn random-sus []
  (clojure.string/capitalize(rand-nth susses)))

(def button-style
  {:padding "10px 14px 10px 14px"
   :align-items "baseline"
   :color "white"
   :background-color "#7b0838"
   :border-radius "10%"
   :border-color "white"})

(defn sus []
  [:<>
   [:img {:src "amogus.png" :style {:width "400px" :height "auto"}}]
   [:h1 @sus-text]
   [:input {:type "button"
            :value "SUS!"
            :style button-style
            :on-click #(swap! sus-text random-sus)}]])
