#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "R I P D Agenci z zaświatów komedia sensacyjna USA 2013 ^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/29-24CF591E-9E42-43D2-82C6-09DAD4321C54 TVN_Fabuła 20-00 R 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/29-24CF591E-9E42-43D2-82C6-09DAD4321C54_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/29-24CF591E-9E42-43D2-82C6-09DAD4321C54_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/29-24CF591E-9E42-43D2-82C6-09DAD4321C54_URL.sh" \
   --button=gtk-quit\:1 &