#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Strażnik film sensacyjny USA 2006 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/25-80A94917-B4D3-4FDA-AFB6-B85DEAE327ED Paramount_ChHD 20-00 STRAŻNIK 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/25-80A94917-B4D3-4FDA-AFB6-B85DEAE327ED_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/25-80A94917-B4D3-4FDA-AFB6-B85DEAE327ED_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/25-80A94917-B4D3-4FDA-AFB6-B85DEAE327ED_URL.sh" \
   --button=gtk-quit\:1 &
