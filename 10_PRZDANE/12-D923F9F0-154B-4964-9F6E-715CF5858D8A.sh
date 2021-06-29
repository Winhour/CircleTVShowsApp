#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Granice wytrzymałości film przygodowy Niemcy 2000 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/12-D923F9F0-154B-4964-9F6E-715CF5858D8A POLSAT_Film 18-20 GRANICE 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/12-D923F9F0-154B-4964-9F6E-715CF5858D8A_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/12-D923F9F0-154B-4964-9F6E-715CF5858D8A_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/12-D923F9F0-154B-4964-9F6E-715CF5858D8A_URL.sh" \
   --button=gtk-quit\:1 &