(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little man!"))


(defn error-message
  [severity]
  println(str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOMED!"))  
  )

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
 ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
  (x-chop name "karate")))


(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(println "fdsafdsafdsa")


(defn train 
[]
println "Choo choo!" )


(map (fn [name] (str "Hi, " name))
 ["Darth Vader" "Mr. Magoo"])

(defn number-comment
  [x]
  (if (> x 6)
    "Oh my gosh! What a big number!"
    "That number's OK, I guess"))




(defn hello
  "test"
  [input]
  (str input " !"))


(defn greetmeyou
  "I'll greet you"
  [s]
  (str "Hello " s "!"))