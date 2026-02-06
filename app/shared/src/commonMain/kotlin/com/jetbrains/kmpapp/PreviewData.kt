package com.jetbrains.kmpapp

import com.jetbrains.kmpapp.data.MuseumObject
import org.jetbrains.annotations.VisibleForTesting


@VisibleForTesting
fun getPreviewMuseumObject() = MuseumObject(
    objectID = 11207,
    title = "The Flower Girl",
    artistDisplayName = "Charles Cromwell Ingham",
    medium = "Oil on canvas",
    dimensions = "36 x 28 3/8 in. (91.4 x 72.1 cm)",
    objectURL = "https://www.metmuseum.org/art/collection/search/11207",
    objectDate = "1846",
    primaryImage = "https://images.metmuseum.org/CRDImages/ad/original/DT2784.jpg",
    primaryImageSmall = "https://images.metmuseum.org/CRDImages/ad/web-large/DT2784.jpg",
    repository = "Metropolitan Museum of Art, New York, NY",
    department = "The American Wing",
    creditLine = "Gift of William Church Osborn, 1902"
)