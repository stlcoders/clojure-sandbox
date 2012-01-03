(ns avg.core)
; average each item in a vector with its neighbors

defn avg [all]
  (/ (apply + all) (count all)))

(defn neighborhood [coll i]
  (filter #(not (nil? %1))
          [ (get coll (dec i))
            (get coll i)
            (get coll (inc i))]))
    

(defn solve [coll]
  (map-indexed (fn [ index item ] (avg (neighborhood coll index))) coll))

;  (solve [ 1 2 3 ])
