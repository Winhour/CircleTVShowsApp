#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Narzeczona dla księcia film fantasy USA 1987 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/07-9FD488D1-0E21-4486-95AE-7C4DCFF20B13 Kino_TV_HD 17-50 NARZECZONA 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/07-9FD488D1-0E21-4486-95AE-7C4DCFF20B13_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/07-9FD488D1-0E21-4486-95AE-7C4DCFF20B13_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/07-9FD488D1-0E21-4486-95AE-7C4DCFF20B13_URL.sh" \
   --button=gtk-quit\:1 &
