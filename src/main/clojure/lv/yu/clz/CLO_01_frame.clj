
;;;-----------------------------
 ; 
 ; Clojure package     lv.yu.clz
 ; 
 ; Clojure program     CLO_01_frame.clj     Apache License 2.0
 ;      
 ; Copyright (c)       Yuri Utkin 2023      mob.+371 12345678     https://www.jago.lv
 ; 
 ;;------------------------------
	 
(ns ^{:doc    "Clojure package     lv.yu.clz
	           Clojure program     CLO_01_frame.clj     Apache License 2.0
	           Copyright (c)       Yuri Utkin 2023      mob.+371 12345678     https://www.jago.lv"
	  :author "Yuri Utkin"}
		
	lv.yu.clz.CLO-01-frame  ;;  CLO-01-frame demonstrates Clojure Frame
		
  (:import [javax.swing
                       JFrame                      
                       ImageIcon ]
  )  ;;  end import 
   
)  ;;  end ns
     
;;------------------------------
            
  (gen-class
    :name lv.yu.clz.CLO_01_frame
    :main true
    :methods [[CLO_01_frame [] void]]
  )

;;------------------------------

(defn initframe [#^JFrame frame]

;;------------------------------

(let [

      imgURL                 (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg")) 
      icon_frame (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg"))) 
	  
     ]

;;------------------------------   

    (doto frame
    
        (.setTitle (str "     CLOJURE -- CLO_01_frame -- v. 2023.01.01"))
     
        (.setBounds (+ 10 (* 0 40) 300) (+ 10 (* 0 40)) 1000 600)
      
        (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)

        (.setIconImage (.getImage icon_frame))
        
        (.setVisible true)
        
    )  ;;  end frame
      
)  ;;  end let

;;------------------------------
      
)  ;;  end initframe
   
;;------------------------------

(defn CLO_01_frame [this]

  (let [frame (JFrame.)] (initframe frame) )  

)  ;;  end CLO_01_frame []

;;------------------------------   
   
(defn -main [& args]
                    (CLO_01_frame[])					
)  ;;  end -main []
            
;;------------------------------
