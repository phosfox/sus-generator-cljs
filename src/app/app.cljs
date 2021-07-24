(ns app.app
  (:require [app.sus :refer [sus]]))

(def app-style
  {:text-align "center"
   :margin-top "60px"
   :color "#2c3e50"
   :font-family "Avenir, Helvetica, Arial, sans-serif"})

(defn app []
  [:<>
   [:div {:style app-style}
    [sus]]])
