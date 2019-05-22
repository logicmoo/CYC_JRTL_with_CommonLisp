(in-package :ms)

(defmeasure distance "m"
  :units (:metric ("angstrom" 1/10000000000 "m")
		  ("ang" "angstrom")
		  ("in" 254/10000 "m") 
                  ("ft" 12 "in")
                  ("yd" 3 "ft")
                  ("fathom" 6 "ft")
                  ("mile" 5280 "ft")
		  ("miles" "mile")
                  ("nm" 2027 "yd")
		  ("furlong" 220 "yd")
		  ("AU" 149598550000 "m")
		  ("lightyear" 9460500000000000 "m")
		  ("LY" "lightyear")
		  ("parsec" 30856770000000000  "m")) )

(defmeasure area "m2"
  :units (("sqyd" "yd" "yd")
          ("sqft" "ft" "ft")
	  ("sqin" "in" "in")
          ("sqkm" "km" "km")
          ("mm2" "mm" "mm")
          ("cm2" "cm" "cm")
	  ("ft2" "ft" "ft")
	  ("yd2" "ft" "ft")
	  ("in2" "in" "in")
          ("sqmile" "mile" "mile")
	  ("mile2" "mile" "mile")
	  ("nm2" "nm" "nm")
	  ("km2" "km" "km")
          ("hectare" 10000 "m2")
          ("ha" "hectare")
          ; ("hectare" 100 "are")
          ("are" 100 "m" "m")
          ("acre" 4840 "sqyd")) )

(defmeasure volume "m3"
  :units (("liter" 1/1000 "m3")
	  ("l" "liter")
          ("ml" 1/1000 "liter")
          ("cc" "ml")
          ("cl" 1/100  "liter")
          ("dl" 1/10   "liter")
          ("Hl" 100    "liter")
          ("cuft" "ft" "ft" "ft")
	  ("cuyd" "yd" "yd" "yd")
	  
	  ("mm3" "mm" "mm" "mm")
	  ("cm3" "cm" "cm" "cm")
	  ("km3" "km" "km" "km")
	  ("in3" "in" "in" "in")
	  ("ft3" "ft" "ft" "ft")
	  ("yd3" "yd" "yd" "yd")
	  ("mile3" "mile" "mile" "mile")
	  ("nm3" "nm" "nm" "nm")

	  ("gal" 3785/1000 "liter")
          ("acrefeet" "acre" "ft")
          ("pint" 1/8 "gal")
          ("quart" 1/4 "gal")
	  ("floz" 1/16 "pint")		; Fluid Ounce
          ("barrel" 42 "gal")
          ("bbl" 1 "barrel")
          ("Mbbl" 1000000 "barrel")
          ("Bbbl" 1000000000 "barrel")
          ("BRT" 100 "ft3"))            ; Register ton
  ; :format (:best-fit "ml" "l")
  )

(defmeasure time "s" 
  :units (("ms" 1/1000 "s")
	  ("min" 60 "s") ("h" 60 "min") ("day" 24 "h") ("hr" "h")
	  ("week" 7 "day")
          ("year" 3652422/10000 "day") ("decade" 10 "year") ("century" 100 "year")))

(defmeasure speed "m/s"
  :units ("km/h" 
          ("mph" 1397/3125 "m/s")   ; Was 1609/1000
          ("kts" 257429/500000 "m/s") ; Was 18532/10000
	  "ft/s" 
          ("knots" "kts")))

(defmeasure accleration "m/s2"
  :units (("G" 980665/100000 "m/s2")
	  "ft/s2"))

(defmeasure angle "deg"
  :units (("rad" #.(rationalize (/ 180 pi)) "deg")
          ("minute" 1/60 "deg")
          ("sec" 1/60 "min")
          ("mil" 360/6400 "deg")  ;; Def'n from webster
	  ;; ("mil" #.(rationalize (/ 17.45)) "deg") ;; Subtend 1' at 1000'
	  ;; ("mil" 1/1000 "rad")  ;; Milliradian
          )
  ; :format (:best-fit "sec" "min" "deg")
  )

(defmeasure mass "g"
  :units (:metric 
          ("lbs" 4536/10 "g")
          ("oz" 1/16 "lbs")
	  ("gr" 1/7000 "lbs")  ; grain
	  ("lb" "lbs")
          ("mton" 1000000 "g")
          ("tonne" 1000000 "g")
          ("ton" 2000 "lbs")
          ("stone" 14 "lbs")
          ("hwt" 100 "lbs")
          ("slug" 14590 "g")
          ("carat" 205/1000 "g"))
  ; :format (:best-fit "g" "kg" "mton")
  )

(defmeasure force "g.m/s2"
  :units (("N" "kg" "m/s2")
	  ("kN" 1000 "N")
	  ("kgf" "kg.G")
	  ("lbf" "lb.G")
         ; ("kgf" 9807/1000 "N")
         ; ("lbf" 4448/1000 "N")
          ("dyne" 1/100000 "N")
	  )
  :format (:unit "N"))

(defmeasure pressure "g/s2m"
  :units (("N/m2" 1000 "g/s2m")
          ;("atm" 10332 "kgf/m2")
          ;("atm" 101325924 "g/s2m")
	  ("atm" 101325000 "g/s2m")
          ("inHg" 3342/100000 "atm")
          ("mmHg" 3937/100000 "inHg")
          ;("psi"  7031/10 "kgf/m2")
          ("psi"  68953017/10 "g/s2m")
          ("Pa" 1000 "g/s2m")
	  ("hPa" 100 "Pa")
          ("kP" 1000 "Pa")
          ("kPa" 1 "kP")
	  ;("bar" 145/10 "psi")
	  ("bar" 100000 "Pa")
          ("mbar" 1/1000 "bar")
          )
 ;  :format (:unit "mbar")
  )

(defmeasure density "g/m3"
  :units ("kg/m3" "g/cm3" "lbs/in3")
  :format (:best-fit "g/m3" "kg/m3" "g/cm3"))

(defmeasure torque "m2g/s2"
  :units (("N.m" "N" "m")
	  ("ft.lbf" "lbf" "ft")
	  ("in.lbf" "lbf" "in"))
  ; :format (:unit "N.m")
  )


(defmeasure power "m2g/s3"
  :units (("W" "N" "m/s")
          ("hp" 746 "W")   ; (electric) (was: 7457/10) (metric approx. 735.499)
	  ("shp" "hp")
	  ("mW" 1/1000 "W")
          ("kW" 1000 "W")
          ("MW" 1000000 "W")
          ("GW" 1000000000 "W"))
  ; :format (:best-fit "W" "kW" "MW" "GW")
  )


;; BTU and calorie have several different values.
;; BTU: (IT 1055.056)  (thermochemical 1054.35) (mean 1055.87)
;; calorie: (IT 4.1868 #)  (thermochemical 4.184 #) (mean 4.19002)
;;          (15C 4.18580)  (20C 4.18190)

(defmeasure work "m2g/s2"
  :units (("J" "N" "m")
	  ("kJ" 1000 "J")
	  ("MJ" 1000000 "J")
	  ("GJ" 1000000000 "J")
          ("BTU" 1055056/1000 "J")   ; IT
          ("cal" 41868/10000 "J")  ; IT
          ("kcal" 1000 "cal")
	 ; ("Cal" 1000 "cal")  ;; Corresponds to food calorie!
	  ("therm" 100000 "BTU")
         ; ("erg" 1/10000000 "J")       ;; No ergs because "e" is reserved for expoential number notations.
	  ("kWh" "kW.h")
          )
  ; :format (:unit "J")
  )

(defmeasure revolution "deg/s"
  :units (("rps" 360 "deg/s")
          ("rpm" 60 "rps"))
  :format (:best-fit))

(defmeasure data "bit"
  :units (("byte" 8 "bit")
          ("kbit" 1024 "bit")
	  ("Mbit" 1024 "kbit")
	  ("kB" 1024 "byte")
	  ("MB" 1024 "kB")
	  ("GB" 1024 "MB")
	  ("TB" 1024 "GB"))
  :format (:best-fit "byte" "kB" "MB" "GB" "TB"))

;; ??
;(defmeasure light "lambert"
;  
;  )
          

;;
;; Temperature
;;

(defun f-to-c (x) (* 5/9 (- x 32)))
(defun c-to-f (x) (+ 32 (* 9/5 x)))

(defun f-to-k (x) (* 5/9 (+ x 57461/125)))
(defun k-to-f (x) (- (* 9/5 x) 57461/125))
(defun k-to-c (x) (- x 27316/100))
(defun c-to-k (x) (+ x 27316/100))
(defun k-to-r (x) (* x 9/5))
(defun r-to-k (x) (* x 5/9))

(defspecial-measure temperature "K"
  :units (("F" f-to-k k-to-f)
	  ("C" c-to-k k-to-c)
	  ("R" r-to-k k-to-r)))

;; Relative temperature differences:
;
;
;(defmeasure delta-temperature "oC"
;  :units (("oK" "oC")
;	   ("oF" 9/5 "oC")
;          ("oR" "oF")))
;

;;
;; Scalars
;;
;; TO DO:  DO WE NEED TO MAKE "NUMBER" BE A SUBCLASS OF SCALAR-MEASURE?
;;

(declare-unit-char #\%)
(defscalars :units (("%" 1/100) ("%%" 1/1000)))

#|

|#

(export '(distance area volume time speed accleration angle mass force pressure density
	  torque power work revolution data temperature scalar))

