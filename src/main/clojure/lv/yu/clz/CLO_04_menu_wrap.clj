
;;;-----------------------------
 ;
 ; Clojure package     lv.yu.clz
 ;
 ; Clojure program     CLO_04_menu_wrap.clj     Apache License 2.0
 ;
 ; Copyright (c)       Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 ;
 ;;------------------------------

(ns ^{:doc    "Clojure package     lv.yu.clz
               Clojure program     CLO_04_menu_wrap.clj      Apache License 2.0
               Copyright (c)       Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv"
      :author "Yuri Utkin"}

    lv.yu.clz.CLO-04-menu-wrap  ;;  CLO-04-menu-wrap demonstrates Clojure Menu Wrap in Clojure Frame

  (:import [javax.swing
                          JFrame
                          ImageIcon
                          JScrollPane
                          JTextArea
                          JMenu
                          JMenuBar
                          JMenuItem 
                          JCheckBoxMenuItem
                          KeyStroke]
           [java.awt
                          BorderLayout]
           [java.awt.event
                          KeyEvent
                          ActionEvent]

  )  ;;  end import

)  ;;  end ns

;;------------------------------

  (gen-class
    :name lv.yu.clz.CLO_04_menu_wrap
    :main true
    :methods [[CLO_04_menu_wrap [] void]]
  )

;;------------------------------

(defn initframe [#^JFrame frame]

;;------------------------------

(let [

      imgURL                 (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg"))
      icon_frame (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg")))

     ]

;;------------------------------

    (def title (str "CLOJURE -- CLO_04_menu_wrap -- v. 2023.12.12"))

    (doto frame

        (.setTitle (str "     " title))

        (.setBounds (+ 10 (* 3 40) 300) (+ 10 (* 3 40)) 1000 600)

        (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)

        (.setIconImage (.getImage icon_frame))

        (.setLayout (BorderLayout.))

        (.setVisible true)

    )  ;;  end frame

)  ;;  end let

;;------------------------------

  (let [

        icon_Start        (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/start.gif")))
        icon_Load         (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/load.gif")))
        icon_Xxxx         (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/xxxx.png")))
        icon_Information  (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/information.gif")))
        icon_Help         (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/help.png")))
        icon_About        (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/about.gif")))
        icon_Eng          (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/prefs.gif")))
        icon_Rus          (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/prefs.gif")))
        icon_Lat          (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/prefs.gif")))
        icon_Exit         (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/exit.png")))

;;------------------------------

        menubar            (JMenuBar.)

        menu_Menu          (JMenu. "Menu")
          item_Start         (JMenuItem. "Start" icon_Start)
          item_Load          (JMenuItem. "Load"  icon_Load)
          item_Xxxx          (JMenuItem. "Xxxx"  icon_Xxxx)

        menu_Start1        (JMenu. "Start1")
          item_St11          (JMenuItem. "St11")
          item_St12          (JMenuItem. "St12")

        menu_Start2        (JMenu. "Start2")
          item_St21          (JMenuItem. "St21")
          item_St22          (JMenuItem. "St22")

        menu_Start3        (JMenu. "Start3")
          item_St31          (JMenuItem. "St31")
          item_St32          (JMenuItem. "St32")

        menu_Help          (JMenu. "Help")
          item_Information   (JMenuItem. "Information" icon_Information)
          item_Help          (JMenuItem. "Help"        icon_Help)
          item_About         (JMenuItem. "About"       icon_About)

        menu_Lang          (JMenu. "Lang")
          item_Eng           (JCheckBoxMenuItem. "Eng" icon_Eng)
          item_Rus           (JCheckBoxMenuItem. "Rus" icon_Rus)
          item_Lat           (JCheckBoxMenuItem. "Lat" icon_Lat)

        menu_Exit          (JMenu. "Exit")
          item_Exit          (JMenuItem. "Exit" icon_Exit)

        ]

;;------------------------------

        (doto menu_Menu (.setMnemonic KeyEvent/VK_M))  ;;  Alt M
        (doto menu_Menu (.setToolTipText "Menu commands"))
          (doto item_Start (.setToolTipText "Start application"))
          (doto item_Load  (.setToolTipText "Load application"))
          (doto item_Xxxx  (.setToolTipText "Xxxx application"))
          (doto item_Start (.setAccelerator (KeyStroke/getKeyStroke KeyEvent/VK_S ActionEvent/ALT_MASK)))  ;;  Alt S
          (doto item_Load  (.setAccelerator (KeyStroke/getKeyStroke KeyEvent/VK_L ActionEvent/ALT_MASK)))  ;;  Alt L
          (doto item_Xxxx  (.setAccelerator (KeyStroke/getKeyStroke KeyEvent/VK_X ActionEvent/ALT_MASK)))  ;;  Alt X

        (doto menu_Start1 (.setMnemonic KeyEvent/VK_1))  ;;  Alt 1
        (doto menu_Start1 (.setToolTipText "Start1 commands"))
          (doto item_St11 (.setToolTipText "St11 application"))
          (doto item_St12 (.setToolTipText "St12 application"))

        (doto menu_Start2 (.setMnemonic KeyEvent/VK_2))  ;;  Alt 2
        (doto menu_Start2 (.setToolTipText "Start2 commands"))
          (doto item_St21 (.setToolTipText "St21 application"))
          (doto item_St22 (.setToolTipText "St22 application"))

        (doto menu_Start3 (.setMnemonic KeyEvent/VK_3))  ;;  Alt 3
        (doto menu_Start3 (.setToolTipText "Start3 commands"))
          (doto item_St31 (.setToolTipText "St31 application"))
          (doto item_St32 (.setToolTipText "St32 application"))

        (doto menu_Help (.setMnemonic KeyEvent/VK_H))  ;;  Alt H
        (doto menu_Help (.setToolTipText "Help commands"))
          (doto item_Information (.setToolTipText "Information application"))
          (doto item_Help (.setToolTipText "Help application"))
          (doto item_About (.setToolTipText "About application"))

        (doto menu_Lang (.setMnemonic KeyEvent/VK_L))  ;;  Alt L
        (doto menu_Lang (.setToolTipText "Lang commands"))
          (doto item_Eng (.setToolTipText "Eng application"))
          (doto item_Rus (.setToolTipText "Rus application"))
          (doto item_Lat (.setToolTipText "Lat application"))
          (doto item_Eng (.setSelected true))

        (doto menu_Exit (.setMnemonic KeyEvent/VK_E))  ;;  Alt E
        (doto menu_Exit (.setToolTipText "Exit commands"))
          (doto item_Exit (.setToolTipText "Exit application"))

;;------------------------------

        (.add menu_Menu item_Start)
        (.add menu_Menu item_Load)
        (.add menu_Menu item_Xxxx)

        (.add menu_Start1 item_St11)
        (.add menu_Start1 item_St12)

        (.add menu_Start2 item_St21)
        (.add menu_Start2 item_St22)

        (.add menu_Start3 item_St31)
        (.add menu_Start3 item_St32)

        (.add menu_Help item_Information)
        (.add menu_Help item_Help)
        (.add menu_Help item_About)

        (.add menu_Lang item_Eng)
        (.add menu_Lang item_Rus)
        (.add menu_Lang item_Lat)

        (.add menu_Exit item_Exit)

;;------------------------------

        (.add menubar menu_Menu)
        (.add menubar menu_Start1)
        (.add menubar menu_Start2)
        (.add menubar menu_Start3)
        (.add menubar menu_Help)
        (.add menubar menu_Lang)
        (.add menubar menu_Exit)

;;------------------------------

        (doto menubar (.setLayout ( lv.yu.clz.JAV_LIB_wrap_layout. ( lv.yu.clz.JAV_LIB_wrap_layout/LEFT ) 0 0 ) ) )

        (doto frame (.setJMenuBar menubar))

 )  ;;  end let

;;------------------------------

(let [

      textarea (JTextArea.)
      scrollpane (JScrollPane. textarea)

     ]

      (doto textarea (.setText "

        💞️💞️ EN

        Comparative analysis of programming in Java, Kotlin, Clojure, Groovy, Scala and Jython.

        How to Program Java, Kotlin, Clojure, Groovy, Scala and Jython Simultaneously.

        Integration of Java, Kotlin, Clojure, Groovy, Scala and Jython in one software product.



        👋👋 RU

        Сравнительный анализ программирование на Java, Kotlin, Clojure, Groovy, Scala и Jython.

        Как программировать одновременно на Java, Kotlin, Clojure, Groovy, Scala и Jython.

        Интеграция Java, Kotlin, Clojure, Groovy, Scala и Jython в одном программном продукте.



        🌱🌱 LV

        Java, Kotlin, Clojure, Groovy, Scala un Jython programmēšanas salīdzinošā analīze.

        Kā programmēt Java, Kotlin, Clojure, Groovy, Scala un Jython vienlaicīgi.

        Java, Kotlin, Clojure, Groovy, Scala un Jython integrācija vienā programmatūras produktā.

                               " ) )

      (doto (.getContentPane frame) (.add scrollpane(BorderLayout/CENTER)))

      (doto frame (.setVisible true))

)  ;;  end let

;;------------------------------

)  ;;  end initframe

;;------------------------------

(defn CLO_04_menu_wrap [this]

  (let [frame (JFrame.)] (initframe frame) )

)  ;;  end CLO_04_menu_wrap []

;;------------------------------

(defn -main [& args]
                    (CLO_04_menu_wrap[])
)  ;;  end -main []

;;------------------------------
