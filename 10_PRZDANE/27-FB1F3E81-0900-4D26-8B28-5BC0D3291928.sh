#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Psychol thriller USA 1998 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/27-FB1F3E81-0900-4D26-8B28-5BC0D3291928 Stopklatka 20-00 PSYCHOL 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/27-FB1F3E81-0900-4D26-8B28-5BC0D3291928_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/27-FB1F3E81-0900-4D26-8B28-5BC0D3291928_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/27-FB1F3E81-0900-4D26-8B28-5BC0D3291928_URL.sh" \
   --button=gtk-quit\:1 &
