(ns avg.core)
(defn avg [& all]
  (/ (apply + all) (count all)))

(defn allofus [coll i]
  (filter #(not (nil? %1))
          [ (get coll (dec i))
            (get coll i)
            (get coll (inc i))]))
    


  
