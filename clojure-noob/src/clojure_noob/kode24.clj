(ns clojure-noob.exercises
  (:gen-class))

(def secret  "tÅPdmÆudOvnsCøaaæJlYtoCqåoMuYOGØHQiebIygtÆGJBøATzOiIirIpreuGzKKmYUZGiiFSzpmeLHXSLaShoPPalgGQugmUSsmpÅohtXkctjxqÆniÆmDeGuÆidGdymVøAMRPhGmrøFcrsfQIæRR")

;tulipA

(count secret)

(comment (println (count secret)))

(subs secret 81 82)



(defn getpassword
  [index]
  (println (subs secret 1)))

(->> getpassword)

(defn getletter
  [x]
  (nth secret x))


(defn recursive-printer
  ([]
   (recursive-printer 0))
  ([iteration]
   (println iteration)
   (if (> iteration 3)
     (println "Goodbye!")
     (recursive-printer (inc iteration)))))



(defn recursive1
  ([]
   (recursive1 0 0))
  ([iteration sum]
   (println "Iteration: " iteration "sum :" sum)
   (def delta (* iteration 5))
   (def pos (+ sum delta))
   (println (str "delta " delta " pos " pos))
   (println (getletter pos))
   (def n (+ 1 pos))
   (if (> iteration 5)
     (println "Goodbye!")
     (recursive1 (inc iteration) n))))

(recursive1)



(let [s "Eric Normand"
      s (str/upper-case s)
      s (str/trim s)
      s (str/replace s #" +" "-")]
  (println s))


;; (test
;; a (println (getletter 0))  0 + 0  + 0   ; 0
;; b (println (getletter 6))  1 + 0  + 5   ; 6
;; c (println (getletter 18)) 1 + 6  + 10  ; 18  
;; d (println (getletter 35)) 1 + 18 + 15  ; 35  
;; e (println (getletter 56)) 1 + 35 + 20  ; 56
;; d (println (getletter 82)) 1 + 56 + 25  ; 82
;;  (println (getletter 113)) 
;; )


(+ 1 56 25)




; 0+1 , 5+1 , 10+1, 15+1 , 20 +1 ,25+1 ,30 +1
;  1 ,   6 ,   18 ,  34 , 
;  tulipan 

;(getindex 0 )

;(getletter 18 19)

