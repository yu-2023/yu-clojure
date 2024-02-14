
;;;-----------------------------
 ;
 ; Clojure package     lv.yu.clz
 ;
 ; Clojure program     CLO_07_internal_frame_six.clj     Apache License 2.0
 ;
 ; Copyright (c)       Yuri Utkin 2023                   mob.+371 12345678     https://www.jago.lv
 ;
 ;;------------------------------

(ns ^{:doc    "Clojure package     lv.yu.clz
               Clojure program     CLO_07_internal_frame_six.clj     Apache License 2.0
               Copyright (c)       Yuri Utkin 2023                   mob.+371 12345678     https://www.jago.lv"
      :author "Yuri Utkin"}

    lv.yu.clz.CLO-07-internal-frame-six  ;;  CLO-07-internal-frame-six demonstrates Clojure Internal Frames Six in Clojure Frame

  (:import [javax.swing
                          JFrame
                          ImageIcon
                          JInternalFrame
                          JPanel
                          JDesktopPane
                          JLabel
                          JMenu
                          JMenuBar
                          JMenuItem
                          JCheckBoxMenuItem
                          KeyStroke]
           [java.awt
                          Toolkit
                          Color
                          Dimension
                          BorderLayout]
           [java.awt.event
                          KeyEvent
                          ActionEvent
                          ActionListener]

  )  ;;  end import

)  ;;  end ns

;;------------------------------

  (gen-class
    :name lv.yu.clz.CLO_07_internal_frame_six
    :main true
    :methods [[CLO_07_internal_frame_six [] void]]
  )

;;------------------------------

(defn create-listener [lmbd]
  (proxy [ActionListener] []
    (actionPerformed [e] (lmbd e))))

;;------------------------------

(defn initframe [#^JFrame frame]

;;------------------------------

(let [

      imgURL                 (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg"))
      icon_frame (ImageIcon. (.getResource (.getContextClassLoader (Thread/currentThread)) (str "lv/yu/clz/CLO_resources/CLO.jpg")))

     ]

;;------------------------------

    (def title (str "CLOJURE -- CLO_07_internal_frame_six -- v. 2023.12.12"))

    (doto frame

        (.setTitle (str "     " title))

        (.setBounds (+ 10 (* 6 40) 300) (+ 10 (* 6 40)) 1000 600)

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

        (doto item_Start       (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Load        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Xxxx        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_St11        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_St12        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_St21        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_St22        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_St31        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_St32        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Information (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Help        (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_About       (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Eng         (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Rus         (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Lat         (.addActionListener (create-listener (fn [e] (println "Selected menu: " (.getActionCommand e)) ) ) ) )
        (doto item_Exit        (.addActionListener (create-listener (fn [e] (System/exit 0)                                   ) ) ) )

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

        panel_1 (JPanel.)
        panel_2 (JPanel.)
        panel_3 (JPanel.)

        label_info (JLabel.)

        desktoppane_11 (JDesktopPane.)
        desktoppane_12 (JDesktopPane.)
        desktoppane_13 (JDesktopPane.)
        desktoppane_21 (JDesktopPane.)
        desktoppane_22 (JDesktopPane.)
        desktoppane_23 (JDesktopPane.)

        internalframe_start_11 (JInternalFrame. "11 START" true false true, true)
        internalframe_start_12 (JInternalFrame. "12 START START START" true false true, true)
        internalframe_start_13 (JInternalFrame. "13 START" true false true, true)
        internalframe_start_21 (JInternalFrame. "21 START" true false true, true)
        internalframe_start_22 (JInternalFrame. "22 START START START" true false true, true)
        internalframe_start_23 (JInternalFrame. "23 START" true false true, true)

       ]

        (doto panel_1 (.setLayout (BorderLayout.)))
        (doto panel_1 (.setBackground (Color/CYAN)))

        (doto panel_2 (.setLayout (BorderLayout.)))
        (doto panel_2 (.setBackground (Color/MAGENTA)))

        (doto panel_3 (.setLayout (BorderLayout.)))
        (doto panel_3 (.setBackground (Color/lightGray)))

        (doto label_info (.setText "     Copyright     (c)     Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv"))
        (doto label_info (.setForeground (Color/BLACK)))

        (.add panel_3 label_info (BorderLayout/CENTER))

        (doto (.getContentPane frame) (.add panel_1(BorderLayout/NORTH)))
        (doto (.getContentPane frame) (.add panel_2(BorderLayout/CENTER)))
        (doto (.getContentPane frame) (.add panel_3(BorderLayout/SOUTH)))

        (doto desktoppane_11 (.setLayout (BorderLayout.)))
        (doto desktoppane_11 (.setBackground (Color/RED)))
        (doto desktoppane_11 (.setPreferredSize (Dimension. 200 350)))

        (doto desktoppane_12 (.setLayout (BorderLayout.)))
        (doto desktoppane_12 (.setBackground (Color/PINK)))
        (doto desktoppane_12 (.setPreferredSize (Dimension. 600 350)))

        (doto desktoppane_13 (.setLayout (BorderLayout.)))
        (doto desktoppane_13 (.setBackground (Color/YELLOW)))
        (doto desktoppane_13 (.setPreferredSize (Dimension. 200 350)))

        (doto desktoppane_21 (.setLayout (BorderLayout.)))
        (doto desktoppane_21 (.setBackground (Color/BLUE)))
        (doto desktoppane_21 (.setPreferredSize (Dimension. 200 150)))

        (doto desktoppane_22 (.setLayout (BorderLayout.)))
        (doto desktoppane_22 (.setBackground (Color/CYAN)))
        (doto desktoppane_22 (.setPreferredSize (Dimension. 600 150)))

        (doto desktoppane_23 (.setLayout (BorderLayout.)))
        (doto desktoppane_23 (.setBackground (Color/GREEN)))
        (doto desktoppane_23 (.setPreferredSize (Dimension. 200 150)))

        (doto internalframe_start_11 (.setLayout (BorderLayout.)))
        (doto internalframe_start_11 (.setBackground (Color/GRAY)))
        (doto internalframe_start_11 (.setVisible true))

        (doto internalframe_start_12 (.setLayout (BorderLayout.)))
        (doto internalframe_start_12 (.setBackground (Color/GRAY)))
        (doto internalframe_start_12 (.setVisible true))

        (doto internalframe_start_13 (.setLayout (BorderLayout.)))
        (doto internalframe_start_13 (.setBackground (Color/GRAY)))
        (doto internalframe_start_13 (.setVisible true))

        (doto internalframe_start_21 (.setLayout (BorderLayout.)))
        (doto internalframe_start_21 (.setBackground (Color/GRAY)))
        (doto internalframe_start_21 (.setVisible true))

        (doto internalframe_start_22 (.setLayout (BorderLayout.)))
        (doto internalframe_start_22 (.setBackground (Color/GRAY)))
        (doto internalframe_start_22 (.setVisible true))

        (doto internalframe_start_23 (.setLayout (BorderLayout.)))
        (doto internalframe_start_23 (.setBackground (Color/GRAY)))
        (doto internalframe_start_23 (.setVisible true))

        (.add desktoppane_11 internalframe_start_11 (BorderLayout/CENTER))
        (.add desktoppane_12 internalframe_start_12 (BorderLayout/CENTER))
        (.add desktoppane_13 internalframe_start_13 (BorderLayout/CENTER))
        (.add desktoppane_21 internalframe_start_21 (BorderLayout/CENTER))
        (.add desktoppane_22 internalframe_start_22 (BorderLayout/CENTER))
        (.add desktoppane_23 internalframe_start_23 (BorderLayout/CENTER))

        (.add panel_1 desktoppane_11 (BorderLayout/WEST))
        (.add panel_1 desktoppane_12 (BorderLayout/CENTER))
        (.add panel_1 desktoppane_13 (BorderLayout/EAST))
        (.add panel_2 desktoppane_21 (BorderLayout/WEST))
        (.add panel_2 desktoppane_22 (BorderLayout/CENTER))
        (.add panel_2 desktoppane_23 (BorderLayout/EAST))

        (doto frame (.setVisible true))

)  ;;  end let

;;------------------------------

)  ;;  end initframe

;;------------------------------

(defn CLO_07_internal_frame_six [this]

  (let [frame (JFrame.)] (initframe frame) )

)  ;;  end CLO_07_internal_frame_six []

;;------------------------------

(defn -main [& args]
                    (CLO_07_internal_frame_six[])

)  ;;  end -main []

;;------------------------------
