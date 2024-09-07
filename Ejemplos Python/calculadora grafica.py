import svgwrite
from svgwrite import cm, mm

# Create a new SVG drawing
dwg = svgwrite.Drawing('detailed_butterfly.svg', profile='tiny')

# Define the butterfly shape with more details
butterfly = dwg.g(id='butterfly', fill='none', stroke='black', stroke_width=2)

# Left wing (top)
left_wing_top = [
    (50, 100), (30, 60), (50, 20), (90, 20), (110, 60), (90, 100)
]

# Right wing (top)
right_wing_top = [
    (150, 100), (170, 60), (150, 20), (110, 20), (90, 60), (110, 100)
]

# Left wing (bottom)
left_wing_bottom = [
    (50, 100), (30, 140), (50, 180), (90, 180), (110, 140), (90, 100)
]

# Right wing (bottom)
right_wing_bottom = [
    (150, 100), (170, 140), (150, 180), (110, 180), (90, 140), (110, 100)
]

# Draw wings
butterfly.add(dwg.polygon(points=left_wing_top, fill='lightgrey', stroke='black', stroke_width=1.5))
butterfly.add(dwg.polygon(points=right_wing_top, fill='lightgrey', stroke='black', stroke_width=1.5))
butterfly.add(dwg.polygon(points=left_wing_bottom, fill='lightgrey', stroke='black', stroke_width=1.5))
butterfly.add(dwg.polygon(points=right_wing_bottom, fill='lightgrey', stroke='black', stroke_width=1.5))

# Add more details (veins in wings)
veins = [
    [(70, 20), (70, 100)], [(130, 20), (130, 100)],
    [(70, 180), (70, 100)], [(130, 180), (130, 100)]
]

for vein in veins:
    butterfly.add(dwg.line(start=vein[0], end=vein[1], stroke='black', stroke_width=1))

# Body
body = [
    (90, 100), (110, 100), (110, 120), (90, 120), (90, 100)
]

# Draw body
butterfly.add(dwg.polygon(points=body, fill='black', stroke='black', stroke_width=1.5))

# Antennae
antennae = [
    [(100, 100), (95, 80)], [(100, 100), (105, 80)]
]

for antenna in antennae:
    butterfly.add(dwg.line(start=antenna[0], end=antenna[1], stroke='black', stroke_width=1.5))

# Add the butterfly group to the drawing
dwg.add(butterfly)

# Save the SVG file
dwg.save()

# Load the created SVG and display it as an image
import svg2png
from IPython.display import display, Image

# Convert SVG to PNG
svg_file = '/mnt/data/detailed_butterfly.svg'
png_file = '/mnt/data/detailed_butterfly.png'
svg2png.convert(file_obj=open(svg_file), write_to=open(png_file, 'wb'))

# Display the new detailed butterfly image
display(Image(filename=png_file))