
(ns clojure-noob.structures
  (:gen-class))

; map
{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

;vector
(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)

(def vectortest ["a" {:name "Pugsley Winterbottom"} "c"])

(vectortest 1)

(defn vtest
  [x]
  (vectortest x))

(vtest 1)



;list
'(1 2 3 4)

(def listtest '(1 2 3 4) )

(defn getlist []
  (nth listtest 1))

(getlist)

;set
;

(hash-set 1 1 2 2)
