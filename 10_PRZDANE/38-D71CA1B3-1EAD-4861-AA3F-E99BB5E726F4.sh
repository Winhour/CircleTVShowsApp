#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Poranek kojota komedia Polska 2001 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/38-D71CA1B3-1EAD-4861-AA3F-E99BB5E726F4 Kino_TV_HD 21-00 PORANEK 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/38-D71CA1B3-1EAD-4861-AA3F-E99BB5E726F4_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/38-D71CA1B3-1EAD-4861-AA3F-E99BB5E726F4_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/38-D71CA1B3-1EAD-4861-AA3F-E99BB5E726F4_URL.sh" \
   --button=gtk-quit\:1 &
