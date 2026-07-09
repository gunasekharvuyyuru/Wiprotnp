class VideoStore {
    private Video[] store;
    private int videoCount;

    public VideoStore() {
        store = new Video[100];
        videoCount = 0;
    }

    public void addVideo(String name) {
        if (videoCount < store.length) {
            store[videoCount] = new Video(name);
            videoCount++;
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store is full! Cannot add more videos.");
        }
    }

    public void doCheckout(String name) {
        Video video = findVideo(name);

        if (video != null) {
            if (!video.getCheckout()) {
                video.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
            } else {
                System.out.println("Video \"" + name + "\" is already checked out.");
            }
        } else {
            System.out.println("Video \"" + name + "\" not found in store.");
        }
    }

    public void doReturn(String name) {
        Video video = findVideo(name);

        if (video != null) {
            if (video.getCheckout()) {
                video.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
            } else {
                System.out.println("Video \"" + name + "\" was not checked out.");
            }
        } else {
            System.out.println("Video \"" + name + "\" not found in store.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = findVideo(name);

        if (video != null) {
            video.setRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video \"" + name + "\" not found in store.");
        }
    }

    public void listInventory() {
        if (videoCount == 0) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-10s%n", "Video Name", "Checkout Status", "Rating");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < videoCount; i++) {
            System.out.printf("%-20s %-20b %-10d%n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }

        System.out.println("---------------------------------------------------------------------");
    }

    private Video findVideo(String name) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                return store[i];
            }
        }
        return null;
    }
}