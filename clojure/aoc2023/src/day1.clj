(ns day1
  (:gen-class))

(require '[clojure.string :as str])

(def example_input "1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet")

(def ans1
  (->> "src/input/day1.txt"
       slurp
       str/split-lines
       (map #(re-seq #"[0-9]" %))
       (map #(if (= (count %) 1)
               (cons (first %) (first %))
               (cons (first %) (last %))))
       (map str/join)
       (map #(Integer/parseInt %))
       (apply +)))

(prn ans1)
