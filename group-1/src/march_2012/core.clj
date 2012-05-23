(ns march-2012.core)

(defn integer-above-square-root-of [number]
  (int (Math/ceil (Math/sqrt number))))

(defn is-prime? [number]
  (if (<= number 2)
    (= number 2)
    (let [bound (integer-above-square-root-of number)]
      (loop [potential-factor 2]
        (if (> potential-factor bound)
          true
          (if (= 0 (mod number potential-factor))
            false
            (recur (inc potential-factor))))))))

(defn primes []
  (filter #(is-prime? %) (range)))

(defn window-sum [window offset seq]
  (reduce + (take window (drop offset seq))))

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))