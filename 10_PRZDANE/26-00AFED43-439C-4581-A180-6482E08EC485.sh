#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Ostatnia żyrafa film dokumentalny Francja 2017" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/26-00AFED43-439C-4581-A180-6482E08EC485 Planete_HD 20-00 OSTATNIA 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/26-00AFED43-439C-4581-A180-6482E08EC485_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/26-00AFED43-439C-4581-A180-6482E08EC485_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/26-00AFED43-439C-4581-A180-6482E08EC485_URL.sh" \
   --button=gtk-quit\:1 &
