(ns clojure-noob.exercises
  (:gen-class))

(defn usestring
  "test"
  [input]
  (str "Hello " input))


{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}


(get-in {:a 0 :b {:c "ho hum"}} [:b])

({:firstname "christian" :lastname "Zach"} :lastname)

({:name "The Human Coffeepot"} :name)

(:a {:a 1 :b 2 :c 3})

(get ["a" {:name "Pugsley Winterbottom"} "c"] 2)

(get {:a 0 :b 1} :c "unicorns?")

(get {:a 0 :b 1} :c "unicorns?")

(vector "creepy" "full" "moon")

(contains? #{:a :b} :w)

(or - +)

((and (= 1 1) +) 1 2 3)

((first [+]) 1 2 3)

(+ (inc 199) (/ 100 (- 7 2)))
(+ 200 (/ 100 (- 7 2))) ; evaluated "(inc 199)"
(+ 200 (/ 100 5)) ; evaluated (- 7 2)
(+ 200 20) ; evaluated (/ 100 5)
220 ; final evaluation

(defn two-params
  [x y]
  (str "Two parameters! That's nothing! Pah! I will smoosh them "
       "together to spite you! " x y))

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
   (x-chop name "karate")))

(defn weird-arity
  ([]
   "Destiny dressed you this morning, my friend, and now Fear is
     trying to pull off your pants. If you give up, if you give in,
     you're gonna end up naked with Fear just standing there laughing
     at your dangling unmentionables! - the Tick")
  ([number]
   (inc number)))


(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
                "Here they are in case you need to cry over them: "
                (clojure.string/join ", " unimportant-choices))))


(defn select
  [[first-a second-b & rest-c]]
  (println (str "Ho: " first-a))
  (println (str "Hoa: " second-b))
  (println (str "Hob " (clojure.string/join ", " rest-c))))



(defn myfunc
  " test "
  []
  30
  2
  "Dick")



(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))


(defn titleize
  [topic]
  (str topic " for the Brave and True"))


(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))
(defn stats
  [numbers]
  (map #(% numbers) [sum count avg]))

(stats [3 4 10])

(stats [80 1 44 13 6])

(reduce (fn [new-map [key val]]
          (assoc new-map key (inc val)))
        {}
        {:max 30 :min 10})