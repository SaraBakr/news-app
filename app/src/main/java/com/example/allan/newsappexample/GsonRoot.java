package com.example.allan.newsappexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GsonRoot
{


    /**
     * status : ok
     * totalResults : 10
     * articles : [{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Jon Russell","title":"China's Didi pumps $1B into its rebranded driver services business","description":"Didi Chuxing is going pedal to the metal for its automobile services business after it announced it will invest $1 billion into the division, which is also getting a rebrand. The Chinese ride-hailing firm had been tipped to spin out the business and raise $1.\u2026","url":"https://techcrunch.com/2018/08/06/chinas-didi-pumps-1b-into-its-rebranded-driver-services-business/","urlToImage":"https://techcrunch.com/wp-content/uploads/2016/09/didi-2.jpg?w=589","publishedAt":"2018-08-06T09:31:18Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Leslie Hitchcock","title":"Tickets now on sale for TechCrunch Startup Battlefield MENA 2018","description":"TechCrunch Startup Battlefield MENA 2018 represents our first foray into the rapidly developing startup scene in the Middle East and North Africa, and we couldn\u2019t be more thrilled to help identify and showcase the top tech startups in the region. Our premiere\u2026","url":"https://techcrunch.com/2018/08/06/tickets-now-on-sale-for-techcrunch-startup-battlefield-mena-2018/","urlToImage":"https://techcrunch.com/wp-content/themes/techcrunch-2017/images/opengraph-default.png","publishedAt":"2018-08-06T08:38:22Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Jon Russell","title":"LemonBox brings US vitamins and health products to consumers in China","description":"China is rising in many ways \u2014 the economy, consumer spending and technology \u2014 but still many of its population looks overseas, and particularly to the West, for cues on lifestyle and health. That\u2019s a theme that\u2019s being seized by LemonBox, a China-U.S. startu\u2026","url":"https://techcrunch.com/2018/08/05/lemonbox/","urlToImage":"https://techcrunch.com/wp-content/uploads/2018/08/Received-Box.jpeg?w=750","publishedAt":"2018-08-06T06:35:50Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Jon Russell","title":"Apple has removed Infowars podcasts from iTunes","description":"Apple has followed the lead of Google and Facebook after it removed Infowars, the conspiracy theorist organization helmed by Alex Jones, from its iTunes and podcasts apps. Unlike Google and Facebook, which removed four Infowars videos on the basis that the co\u2026","url":"https://techcrunch.com/2018/08/05/apple-has-removed-infowars-podcasts-from-itunes/","urlToImage":"https://techcrunch.com/wp-content/themes/techcrunch-2017/images/opengraph-default.png","publishedAt":"2018-08-06T05:51:47Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Jason Rowley","title":"July sets a record for number of $100M+ venture capital rounds","description":"In July 2018, the tech sector\u2019s leisure class \u2014 venture capitalists \u2014 kicked investments into overdrive, at least when it comes to financing supergiant venture rounds of $100 million or more. With 55 deals accounting for just over $15 billion, July likely set\u2026","url":"https://techcrunch.com/2018/08/05/july-sets-a-record-for-number-of-100m-venture-capital-rounds/","urlToImage":"https://techcrunch.com/wp-content/uploads/2014/05/millionfireworks.jpg?w=520","publishedAt":"2018-08-05T17:10:26Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Anthony Ha, Megan Rose Dickey, Jordan Crook","title":"Original Content podcast: The end is in sight on 'Orange is the New Black'","description":"Orange is the New Black is back for a sixth season, dealing with the fallout from season five and shifting the location to the maximum security wing of Litchfield Prison. On the latest episode of the Original Content podcast, we\u2019re joined by Megan Rose Dickey\u2026","url":"https://techcrunch.com/2018/08/05/original-content-orange-is-the-new-black/","urlToImage":"https://techcrunch.com/wp-content/uploads/2018/08/OITNB_603_Unit_04692_R.jpg?w=601","publishedAt":"2018-08-05T14:00:48Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Jon Evans","title":"Who do you trust?","description":"Another week, another high-profile hack. This week it was (checks notes) Reddit. What makes this one marginally more interesting is that the victims were using two-factor authentication, i.e. SMS codes texted to them to verify their identities when their acco\u2026","url":"https://techcrunch.com/2018/08/05/who-do-you-trust/","urlToImage":"https://techcrunch.com/wp-content/uploads/2018/08/trust.jpg?w=533","publishedAt":"2018-08-05T13:00:29Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Natasha Lomas","title":"Venezuela claims drones loaded with explosives used in failed attack on president","description":"Is the dystopian future of shoestrong budget weaponized drone attacks here already? The BBC and AP are reporting claims by the Venezuela government of an assassination attempt on its president using a couple of drones carrying explosives. President Nicolás Ma\u2026","url":"https://techcrunch.com/2018/08/05/venezuela-claims-drones-loaded-with-explosives-used-in-failed-attack-on-president/","urlToImage":"https://techcrunch.com/wp-content/uploads/2014/11/drones-civilian.jpg?w=533","publishedAt":"2018-08-05T12:56:18Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Natasha Lomas","title":"Wonga investors inject £10M so cash-strapped payday lender can fund claims","description":"If you were at Disrupt London four years ago you may remember more than a little awkwardness during an investor panel when two VCs that had invested in European payday loans firm Wonga declined to comment on what had gone wrong at their portfolio company in t\u2026","url":"https://techcrunch.com/2018/08/05/wonga-investors-inject-10m-so-cash-strapped-payday-lender-can-fund-claims/","urlToImage":"https://techcrunch.com/wp-content/uploads/2016/06/144710269.jpg?w=613","publishedAt":"2018-08-05T11:13:11Z"},{"source":{"id":"techcrunch","name":"TechCrunch"},"author":"Samantha Stein","title":"Only 24 hours left to apply for Startup Battlefield MENA 2018","description":"Time is running out for the best entrepreneurial tech minds and makers across the Middle East and North Africa to compete in TechCrunch Startup Battlefield MENA 2018, which takes place in Beirut, Lebanon on October 3 at the Beirut Digital District. Applicatio\u2026","url":"https://techcrunch.com/2018/08/05/only-24-hours-left-to-apply-for-startup-battlefield-mena-2018/","urlToImage":"https://techcrunch.com/wp-content/uploads/2018/06/Featured_image_MENA.png?w=692","publishedAt":"2018-08-05T09:00:58Z"}]
     */

    @SerializedName("status")
    private String status;
    @SerializedName("totalResults")
    private int totalResults;
    @SerializedName("articles")
    private List<ArticlesBean> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
         this.totalResults = totalResults;
    }

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }
}
