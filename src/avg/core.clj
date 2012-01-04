(ns avg.core)
; average each item in a vector with its neighbors

(defn avg [all]
   (/ (apply + all) (count all)))
;
;(defn neighborhood [coll i]
  ;(filter #(not (nil? %1))
          ;[ (get coll (dec i))
            ;(get coll i)
            ;(get coll (inc i))]))
   ; 
;
;(defn solve [coll]
  ;(map-indexed (fn [ index item ] (avg (neighborhood coll index))) coll))

;  (solve [ 1 2 3 ])

(defn vec-avg [all]
	(/ (apply + all) (count all))
)

(defn neighbours [index all]
	(vec (filter #(not (= nil %1)) [(get all (dec index)) (get all index) (get all (inc index))]))
)

(defn avg-lst [lst] 
(vec 
(reverse 
(loop [x 0 v []]
(if (or (< x (dec (count lst))) (= x (dec (count lst))))
(recur (inc x) (cons (vec-avg (neighbours x lst)) v)) v)
))))

(defn apply-horiz [array]
	(vec
	(reverse
	(loop [x 0 v []]
	(if (or (< x (dec (count array))) (= x (dec (count array)))) 
	(recur (inc x) (cons (avg-lst (nth array x)) v)) v )
	)))
)
